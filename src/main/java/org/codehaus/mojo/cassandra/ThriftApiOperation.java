package org.codehaus.mojo.cassandra;

import org.apache.cassandra.thrift.Cassandra;


public abstract class ThriftApiOperation {
  
  private String keyspace;
  private final String rpcAddress;
  private final int rpcPort;
  private String cqlVersion = "2.0.0";
    private final String username;
    private final String password;

    public ThriftApiOperation(String rpcAddress, int rpcPort, String username, String password)
  {
      this.rpcAddress = rpcAddress;
      this.rpcPort = rpcPort;
        this.username = username;
        this.password = password;
  }
  
  abstract void executeOperation(Cassandra.Client client) throws ThriftApiExecutionException;

  public String getKeyspace()
  {
      return keyspace;
  }

  public void setKeyspace(String keyspace)
  {
      this.keyspace = keyspace;
  }

  public String getRpcAddress()
  {
      return rpcAddress;
  }


  public int getRpcPort()
  {
      return rpcPort;
  }

    public String getCqlVersion()
    {
        return cqlVersion;
    }

    public void setCqlVersion( String cqlVersion )
    {
        this.cqlVersion = cqlVersion;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
