
package com.mycompany.doaki.upx.modelo.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface Conexao {
    public Connection obterConexao() throws SQLException;
    
    
}
