package ru.imetrica.response;

/**
 * 
 * @author Rinat N Ziganshin <jamin@inbox.ru>
 */
public class DefaultResponse 
{
    protected boolean result = false;
    
    protected IData data;
    
    public void setResult(boolean result) {
        this.result = result;
    }
    
    public boolean getResult() {
        return this.result;
    }
    
    public void setData(IData data) {
        this.data = data;
    }
    
    public IData getData() {
        return this.data;
    }
}
