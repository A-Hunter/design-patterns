package patterns.composite;

import java.util.List;

/**
 * Created by Ghazi Ennacer on 27/04/2017.
 */
public abstract class HTMLTag {

    public abstract String getTagName();
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void addChildTag(HTMLTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void removeChildTag(HTMLTag htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public List<HTMLTag> getChildren(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public abstract void generateHtml();

}
