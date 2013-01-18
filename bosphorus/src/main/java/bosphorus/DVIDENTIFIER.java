// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package bosphorus;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class DVIDENTIFIER implements Externalizable, Message<DVIDENTIFIER>, Schema<DVIDENTIFIER>
{

    public static Schema<DVIDENTIFIER> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVIDENTIFIER getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVIDENTIFIER DEFAULT_INSTANCE = new DVIDENTIFIER();

    
    private String issuer;
    private String assigner;
    private String id;
    private String type;

    public DVIDENTIFIER()
    {
        
    }

    public DVIDENTIFIER(
        String issuer,
        String assigner,
        String id,
        String type
    )
    {
        this.issuer = issuer;
        this.assigner = assigner;
        this.id = id;
        this.type = type;
    }

    // getters and setters

    // issuer

    public String getIssuer()
    {
        return issuer;
    }

    public void setIssuer(String issuer)
    {
        this.issuer = issuer;
    }

    // assigner

    public String getAssigner()
    {
        return assigner;
    }

    public void setAssigner(String assigner)
    {
        this.assigner = assigner;
    }

    // id

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    // type

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
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

    public Schema<DVIDENTIFIER> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVIDENTIFIER newMessage()
    {
        return new DVIDENTIFIER();
    }

    public Class<DVIDENTIFIER> typeClass()
    {
        return DVIDENTIFIER.class;
    }

    public String messageName()
    {
        return DVIDENTIFIER.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVIDENTIFIER.class.getName();
    }

    public boolean isInitialized(DVIDENTIFIER message)
    {
        return 
            message.issuer != null 
            && message.assigner != null 
            && message.id != null 
            && message.type != null;
    }

    public void mergeFrom(Input input, DVIDENTIFIER message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.issuer = input.readString();
                    break;
                case 2:
                    message.assigner = input.readString();
                    break;
                case 3:
                    message.id = input.readString();
                    break;
                case 4:
                    message.type = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVIDENTIFIER message) throws IOException
    {
        if(message.issuer == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.issuer, false);

        if(message.assigner == null)
            throw new UninitializedMessageException(message);
        output.writeString(2, message.assigner, false);

        if(message.id == null)
            throw new UninitializedMessageException(message);
        output.writeString(3, message.id, false);

        if(message.type == null)
            throw new UninitializedMessageException(message);
        output.writeString(4, message.type, false);
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
