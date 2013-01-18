// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package bosphorus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class RESOURCEDESCRIPTION implements Externalizable, Message<RESOURCEDESCRIPTION>, Schema<RESOURCEDESCRIPTION>
{

    public static Schema<RESOURCEDESCRIPTION> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static RESOURCEDESCRIPTION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final RESOURCEDESCRIPTION DEFAULT_INSTANCE = new RESOURCEDESCRIPTION();

    
    private List<StringDictionaryItem> originalauthor;
    private List<String> othercontributors;
    private String lifecyclestate;
    private String resourcepackageuri;
    private List<StringDictionaryItem> otherdetails;
    private List<RESOURCEDESCRIPTIONITEM> details;
    private AUTHOREDRESOURCE parentresource;

    public RESOURCEDESCRIPTION()
    {
        
    }

    public RESOURCEDESCRIPTION(
        String lifecyclestate
    )
    {
        this.lifecyclestate = lifecyclestate;
    }

    // getters and setters

    // originalauthor

    public List<StringDictionaryItem> getOriginalauthorList()
    {
        return originalauthor;
    }

    public void setOriginalauthorList(List<StringDictionaryItem> originalauthor)
    {
        this.originalauthor = originalauthor;
    }

    // othercontributors

    public List<String> getOthercontributorsList()
    {
        return othercontributors;
    }

    public void setOthercontributorsList(List<String> othercontributors)
    {
        this.othercontributors = othercontributors;
    }

    // lifecyclestate

    public String getLifecyclestate()
    {
        return lifecyclestate;
    }

    public void setLifecyclestate(String lifecyclestate)
    {
        this.lifecyclestate = lifecyclestate;
    }

    // resourcepackageuri

    public String getResourcepackageuri()
    {
        return resourcepackageuri;
    }

    public void setResourcepackageuri(String resourcepackageuri)
    {
        this.resourcepackageuri = resourcepackageuri;
    }

    // otherdetails

    public List<StringDictionaryItem> getOtherdetailsList()
    {
        return otherdetails;
    }

    public void setOtherdetailsList(List<StringDictionaryItem> otherdetails)
    {
        this.otherdetails = otherdetails;
    }

    // details

    public List<RESOURCEDESCRIPTIONITEM> getDetailsList()
    {
        return details;
    }

    public void setDetailsList(List<RESOURCEDESCRIPTIONITEM> details)
    {
        this.details = details;
    }

    // parentresource

    public AUTHOREDRESOURCE getParentresource()
    {
        return parentresource;
    }

    public void setParentresource(AUTHOREDRESOURCE parentresource)
    {
        this.parentresource = parentresource;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, this);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, this);
    }

    // message method

    public Schema<RESOURCEDESCRIPTION> cachedSchema()
    {
        return this;
    }

    // schema methods

    public RESOURCEDESCRIPTION newMessage()
    {
        return new RESOURCEDESCRIPTION();
    }

    public Class<RESOURCEDESCRIPTION> typeClass()
    {
        return RESOURCEDESCRIPTION.class;
    }

    public String messageName()
    {
        return RESOURCEDESCRIPTION.class.getSimpleName();
    }

    public String messageFullName()
    {
        return RESOURCEDESCRIPTION.class.getName();
    }

    public boolean isInitialized(RESOURCEDESCRIPTION message)
    {
        return 
            message.lifecyclestate != null;
    }

    public void mergeFrom(Input input, RESOURCEDESCRIPTION message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.originalauthor == null)
                        message.originalauthor = new ArrayList<StringDictionaryItem>();
                    message.originalauthor.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                    break;

                case 2:
                    if(message.othercontributors == null)
                        message.othercontributors = new ArrayList<String>();
                    message.othercontributors.add(input.readString());
                    break;
                case 3:
                    message.lifecyclestate = input.readString();
                    break;
                case 4:
                    message.resourcepackageuri = input.readString();
                    break;
                case 5:
                    if(message.otherdetails == null)
                        message.otherdetails = new ArrayList<StringDictionaryItem>();
                    message.otherdetails.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                    break;

                case 6:
                    if(message.details == null)
                        message.details = new ArrayList<RESOURCEDESCRIPTIONITEM>();
                    message.details.add(input.mergeObject(null, RESOURCEDESCRIPTIONITEM.getSchema()));
                    break;

                case 7:
                    message.parentresource = input.mergeObject(message.parentresource, AUTHOREDRESOURCE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, RESOURCEDESCRIPTION message) throws IOException
    {
        if(message.originalauthor != null)
        {
            for(StringDictionaryItem originalauthor : message.originalauthor)
            {
                if(originalauthor != null)
                    output.writeObject(1, originalauthor, StringDictionaryItem.getSchema(), true);
            }
        }


        if(message.othercontributors != null)
        {
            for(String othercontributors : message.othercontributors)
            {
                if(othercontributors != null)
                    output.writeString(2, othercontributors, true);
            }
        }

        if(message.lifecyclestate == null)
            throw new UninitializedMessageException(message);
        output.writeString(3, message.lifecyclestate, false);

        if(message.resourcepackageuri != null)
            output.writeString(4, message.resourcepackageuri, false);

        if(message.otherdetails != null)
        {
            for(StringDictionaryItem otherdetails : message.otherdetails)
            {
                if(otherdetails != null)
                    output.writeObject(5, otherdetails, StringDictionaryItem.getSchema(), true);
            }
        }


        if(message.details != null)
        {
            for(RESOURCEDESCRIPTIONITEM details : message.details)
            {
                if(details != null)
                    output.writeObject(6, details, RESOURCEDESCRIPTIONITEM.getSchema(), true);
            }
        }


        if(message.parentresource != null)
             output.writeObject(7, message.parentresource, AUTHOREDRESOURCE.getSchema(), false);

    }

    public String getFieldName(int number)
    {
        return Integer.toString(number);
    }

    public int getFieldNumber(String name)
    {
        return Integer.parseInt(name);
    }
    
}
