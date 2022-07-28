using System;
using System.Collections.Generic;
using System.Data;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.Xml.Serialization;
using Microsoft.AnalysisServices.AdomdClient;
namespace AdomdClientConsole
{
    class Program
    {
        // Parameters:
        // 1 - adomd connection string
        // 2 - request type: schema; query
        // 3 - request text
        //
        // Examples:
        // "Data source=http://192.168.100.17/OLAP/msmdpump.dll;Integrated Security=SSPI;" schema MDSCHEMA_CUBES
        // "Data source=http://192.168.100.17/OLAP/msmdpump.dll;Integrated Security=SSPI;" query "select from [Adventure Works]"
        static void Main(string[] args)
        {
            if (args.Length > 0)
            {
                AdomdConnection adomdConnection = new AdomdConnection();
                try
                {
                    adomdConnection.ConnectionString = args[0];
                    adomdConnection.Open();
                    if(args.Length > 2)
                    {
                        if(args[1] == "schema")
                        {
                            DataSet dataSet = adomdConnection.GetSchemaDataSet(args[2], new AdomdRestrictionCollection());
                            using (var memoryStream = new MemoryStream())
                            {
                                using (TextWriter streamWriter = new StreamWriter(memoryStream))
                                {
                                    var xmlSerializer = new XmlSerializer(typeof(DataSet));
                                    xmlSerializer.Serialize(streamWriter, dataSet);
                                    Console.WriteLine(Encoding.UTF8.GetString(memoryStream.ToArray()));
                                }
                            }
                        }
                        else if(args[1] == "query")
                        {
                            AdomdCommand adomdCommand = adomdConnection.CreateCommand();
                            adomdCommand.CommandText = args[2];
                            using (XmlReader xmlReader = adomdCommand.ExecuteXmlReader())
                            {
                                XmlDocument doc = new XmlDocument();
                                doc.Load(xmlReader);
                                Console.WriteLine(doc.InnerXml);
                            }
                        }
                    }
                }
                catch(Exception e)
                {
                    Console.WriteLine(e.ToString());
                }
                finally
                {
                    if (adomdConnection.State == System.Data.ConnectionState.Open)
                    {
                        adomdConnection.Close();
                    }
                }
                Console.Read();
            }
        }
    }
}