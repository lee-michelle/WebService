1.����WebServiceServer��Ŀ���ʱ������ServiceHello��java
2.����http://localhost:9001/Service/ServiceHello?wsdl��ַ��ҳ��������ʾxml�ļ�����
3.��cmd,��������wsimport -s E:\\MyEclipseWorkspace\\WebServiceClient\\src -p com.hyan.client -keep http://localhost:9001/Service/ServiceHello?wsdl
4.�Ҽ�WebServiceClient-��Refresh,��������Ӧ��java�ļ�
5.дһ��ServiceTest����������
PS:client��server����Web Service Project��Ŀ�����������myEclipse