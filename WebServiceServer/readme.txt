1.创建WebServiceServer项目完成时候运行ServiceHello.java
2.访问http://localhost:9001/Service/ServiceHello?wsdl地址，页面正常显示xml文件即可
3.打开cmd,运行命令wsimport -s E:\\MyEclipseWorkspace\\WebServiceClient\\src -p com.hyan.client -keep http://localhost:9001/Service/ServiceHello?wsdl
4.右键WebServiceClient-》Refresh,会生成相应的java文件
5.写一个ServiceTest测试类运行
PS:client和server都是Web Service Project项目，运行软件：myEclipse
