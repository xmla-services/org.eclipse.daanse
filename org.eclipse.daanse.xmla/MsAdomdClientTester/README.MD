dotnet add package Microsoft.AnalysisServices.AdomdClient.NetCore.retail.amd64 --version 19.46.0


System.Configuration.ConfigurationManager

dotnet build MsAdomdClientTester.csproj /property:GenerateFullPaths=true /consoleloggerparameters:NoSummary

dotnet bin/Debug/net6.0/MsAdomdClientTester.dll "Data source=http://bi.syncfusion.com/olap/msmdpump.dll;UID=Domain\User;PWD=UserDomainPassword" schema MDSCHEMA_CUBES


-----
old snippets

dotnet add package Microsoft.AnalysisServices.AdomdClient.retail.amd64 --version 19.46.0

dotnet add package System.Configuration.ConfigurationManager
