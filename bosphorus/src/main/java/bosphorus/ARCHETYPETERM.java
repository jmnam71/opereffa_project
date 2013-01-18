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

public final class ARCHETYPETERM implements Externalizable, Message<ARCHETYPETERM>, Schema<ARCHETYPETERM>
{

    public static Schema<ARCHETYPETERM> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ARCHETYPETERM getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ARCHETYPETERM DEFAULT_INSTANCE = new ARCHETYPETERM();

    
    private List<StringDictionaryItem> items;
    private String code;

    public ARCHETYPETERM()
    {
        
    }

    // getters and setters

    // items

    public List<StringDictionaryItem> getItemsList()
    {
        return items;
    }

    public void setItemsList(List<StringDictionaryItem> items)
    {
        this.items = items;
    }

    // code

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
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

    public Schema<ARCHETYPETERM> cachedSchema()
    {
        return this;
    }

    // schema methods

    public ARCHETYPETERM newMessage()
    {
        return new ARCHETYPETERM();
    }

    public Class<ARCHETYPETERM> typeClass()
    {
        return ARCHETYPETERM.class;
    }

    public String messageName()
    {
        return ARCHETYPETERM.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ARCHETYPETERM.class.getName();
    }

    public boolean isInitialized(ARCHETYPETERM message)
    {
        return true;
    }

    public void mergeFrom(Input input, ARCHETYPETERM message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    if(message.items == null)
                        message.items = new ArrayList<StringDictionaryItem>();
                    message.items.add(input.mergeObject(null, StringDictionaryItem.getSchema()));
                    break;

                case 2:
                    message.code = input.readString();
                    break;
                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ARCHETYPETERM message) throws IOException
    {
        if(message.items != null)
        {
            for(StringDictionaryItem items : message.items)
            {
                if(items != null)
                    output.writeObject(1, items, StringDictionaryItem.getSchema(), true);
            }
        }


        if(message.code != null)
            output.writeString(2, message.code, false);
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
