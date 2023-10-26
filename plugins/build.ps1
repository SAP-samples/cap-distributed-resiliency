mvn clean package
copy-item .\result-uploader\target\result-uploader-jar-with-dependencies.jar -destination ..\docker\controller\result-uploader.jar