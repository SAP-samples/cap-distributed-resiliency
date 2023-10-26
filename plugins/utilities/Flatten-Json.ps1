Function Flatten-Json([object] $obj, [string] $prefix = '')
{
  $ht = @{}
  Helper $obj $prefix $ht
  return $ht
}

Function Helper([object] $obj, [string] $prefix, [hashtable] $ht)
{
  if ($obj -eq $null)
  {
    return
  }
  
  [string] $pre = ''
  foreach($property in $obj.psobject.Properties)
  {
      if ($property.MemberType -ne 'NoteProperty')
      {
        continue
      }    
      
      if ([string]::IsNullOrWhitespace($prefix))
      {
        $pre = $property.Name
      }
      else
      {
        $pre = "$($prefix)_$($property.Name)"
      }
      
      [string] $fullName = $property.Value.GetType().FullName
      if ($fullName -eq 'System.Management.Automation.PSCustomObject') 
      {
        Helper $property.Value $pre $ht
      }
      elseif ($fullName -eq 'System.Object[]')
      {
        $valArr = $property.Value
        
        for($i=0; $i -lt $valArr.Length; $i++)
        {
          $ht.Add("$($pre)_$($i)", $valArr[$i])
        }
      }
      else
      {
        $ht.Add($pre, $property.Value)
      }
  }
}