public class Conta{
private boolean logoutJogo = false;
private boolean logoutConta = false;
    
public Conta(boolean logoutJogo, boolean logoutConta){
    this.logoutJogo = false;
    this.logoutConta = false;
}

public boolean setLogoutJogo(){
    return this.logoutJogo = true;
}
    
public boolean setLogoutConta(boolean varOk){
    return this.logoutConta = varOk;
}

public boolean getLogoutJogo(){
    return logoutJogo;
}

public boolean getLogoutConta(){
    return logoutConta;
}
}