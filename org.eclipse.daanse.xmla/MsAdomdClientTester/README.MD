dotnet build MsAdomdClientTester.csproj /property:GenerateFullPaths=true /consoleloggerparameters:NoSummary

dotnet bin/Debug/net6.0/MsAdomdClientTester.dll "Data source=http://bi.syncfusion.com/olap/msmdpump.dll;UID=Domain\User;PWD=UserDomainPassword" schema MDSCHEMA_CUBES
