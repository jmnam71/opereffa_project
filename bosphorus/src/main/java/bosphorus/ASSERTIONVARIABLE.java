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

public final class ASSERTIONVARIABLE implements Externalizable, Message<ASSERTIONVARIABLE>, Schema<ASSERTIONVARIABLE>
{

    public static Schema<ASSERTIONVARIABLE> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ASSERTIONVARIABLE getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ASSERTIONVARIABLE DEFAULT_INSTANCE = new ASSERTIONVARIABLE();

    
    private String name;
    private String definition;

    public ASSERTIONVARIABLE()
    {
        
    }

    public ASSERTIONVARIABLE(
        String name,
        String definition
    )
    {
        this.name = name;
        this.definition = definition;
    }

    // getters and setters

    // name

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    // definition

    public String getDefinition()
    {
        return definition;
    }

    public void setDefinition(String definition)
    {
        this.definition = definition;
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

    public Schema<ASSERTIONVARIABLE> cachedSchema()
    {
        return this;
    }

    // schema methods

    public ASSERTIONVARIABLE newMessage()
    {
        return new ASSERTIONVARIABLE();
    }

    public Class<ASSERTIONVARIABLE> typeClass()
    {
        return ASSERTIONVARIABLE.class;
    }

    public String messageName()
    {
        return ASSERTIONVARIABLE.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ASSERTIONVARIABLE.class.getName();
    }

    public boolean isInitialized(ASSERTIONVARIABLE message)
    {
        return 
            message.name != null 
            && message.definition != null;
    }

    public void mergeFrom(Input input, ASSERTIONVARIABLE message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.name = input.readString();
                    break;
                case 2:
                    message.definition = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ASSERTIONVARIABLE message) throws IOException
    {
        if(message.name == null)
            throw new UninitializedMessageException(message);
        output.writeString(1, message.name, false);

        if(message.definition == null)
            throw new UninitializedMessageException(message);
        output.writeString(2, message.definition, false);
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
