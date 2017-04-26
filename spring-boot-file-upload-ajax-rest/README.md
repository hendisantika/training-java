# Spring Boot file upload example – Ajax and REST

#### Tools used in this article :

1. Spring Boot 1.4.3.RELEASE
2. Spring 4.3.5.RELEASE
3. Thymeleaf
4. jQuery (webjars)
5. Maven
6. Embedded Tomcat 8.5.6
7. Google Chrome Browser (Network Inspect)

#### File Upload
To support Ajax request and response, the easiest solution is returned a ResponseEntity.

The below example demonstrates three possible ways to upload files:

1. Single file upload – MultipartFile
2. Multiple file upload – MultipartFile[]
3. Map file upload to a Model – @ModelAttribute


Start Spring Boot with the default embedded Tomcat `mvn spring-boot:run`.

Access http://localhost:8080/, select few files and clicks submit to fire the ajax request.

#### cURL Testing

More testing with cURL command.

Test single file upload.

```
Terminal

$ curl -F file=@"f:\\data.txt" http://localhost:8080/api/upload/

Successfully uploaded - data.txt
```

#### Test multiple file upload.

```
Terminal

$ curl -F extraField="abc" -F files=@"f://data.txt" -F files=@"f://data2.txt"  http://localhost:8080/api/upload/multi/
Successfully uploaded - data.txt , data2.txt
```


#### Test multiple file upload, maps to Model.

```
Terminal
$ curl -F extraField="abc" -F files=@"f://data.txt" -F files=@"f://data2.txt"  http://localhost:8080/api/upload/multi/model
Successfully uploaded!
```

#### Test a large movie file (100MB), the following error message will be displayed.

```
Terminal
$ curl -F file=@"F://movies//300//Sample.mkv"  http://localhost:8080/api/upload/
Attachment size exceeds the allowable limit! (10MB)
```

#### cURL to upload a large file again.

```
Terminal
$ curl -F file=@"F://movies//300//Sample.mkv"  http://localhost:8080/api/upload/

{"errCode":"0x000123","errDesc":"Attachment size exceeds the allowable limit! (10MB)"}
```

Done. Feedback is welcome.