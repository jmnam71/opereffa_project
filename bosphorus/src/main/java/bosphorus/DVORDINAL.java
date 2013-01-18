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

public final class DVORDINAL implements Externalizable, Message<DVORDINAL>, Schema<DVORDINAL>
{

    public static Schema<DVORDINAL> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static DVORDINAL getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final DVORDINAL DEFAULT_INSTANCE = new DVORDINAL();

    
    private Integer value;
    private DVCODEDTEXT symbol;
    private DVINTERVAL normalrange;
    private List<REFERENCERANGE> otherreferenceranges;
    private CODEPHRASE normalstatus;

    public DVORDINAL()
    {
        
    }

    public DVORDINAL(
        DVCODEDTEXT symbol
    )
    {
        this.symbol = symbol;
    }

    // getters and setters

    // value

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    // symbol

    public DVCODEDTEXT getSymbol()
    {
        return symbol;
    }

    public void setSymbol(DVCODEDTEXT symbol)
    {
        this.symbol = symbol;
    }

    // normalrange

    public DVINTERVAL getNormalrange()
    {
        return normalrange;
    }

    public void setNormalrange(DVINTERVAL normalrange)
    {
        this.normalrange = normalrange;
    }

    // otherreferenceranges

    public List<REFERENCERANGE> getOtherreferencerangesList()
    {
        return otherreferenceranges;
    }

    public void setOtherreferencerangesList(List<REFERENCERANGE> otherreferenceranges)
    {
        this.otherreferenceranges = otherreferenceranges;
    }

    // normalstatus

    public CODEPHRASE getNormalstatus()
    {
        return normalstatus;
    }

    public void setNormalstatus(CODEPHRASE normalstatus)
    {
        this.normalstatus = normalstatus;
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

    public Schema<DVORDINAL> cachedSchema()
    {
        return this;
    }

    // schema methods

    public DVORDINAL newMessage()
    {
        return new DVORDINAL();
    }

    public Class<DVORDINAL> typeClass()
    {
        return DVORDINAL.class;
    }

    public String messageName()
    {
        return DVORDINAL.class.getSimpleName();
    }

    public String messageFullName()
    {
        return DVORDINAL.class.getName();
    }

    public boolean isInitialized(DVORDINAL message)
    {
        return 
            message.symbol != null;
    }

    public void mergeFrom(Input input, DVORDINAL message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.value = input.readInt32();
                    break;
                case 2:
                    message.symbol = input.mergeObject(message.symbol, DVCODEDTEXT.getSchema());
                    break;

                case 3:
                    message.normalrange = input.mergeObject(message.normalrange, DVINTERVAL.getSchema());
                    break;

                case 4:
                    if(message.otherreferenceranges == null)
                        message.otherreferenceranges = new ArrayList<REFERENCERANGE>();
                    message.otherreferenceranges.add(input.mergeObject(null, REFERENCERANGE.getSchema()));
                    break;

                case 5:
                    message.normalstatus = input.mergeObject(message.normalstatus, CODEPHRASE.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, DVORDINAL message) throws IOException
    {
        if(message.value != null)
            output.writeInt32(1, message.value, false);

        if(message.symbol == null)
            throw new UninitializedMessageException(message);
        output.writeObject(2, message.symbol, DVCODEDTEXT.getSchema(), false);


        if(message.normalrange != null)
             output.writeObject(3, message.normalrange, DVINTERVAL.getSchema(), false);


        if(message.otherreferenceranges != null)
        {
            for(REFERENCERANGE otherreferenceranges : message.otherreferenceranges)
            {
                if(otherreferenceranges != null)
                    output.writeObject(4, otherreferenceranges, REFERENCERANGE.getSchema(), true);
            }
        }


        if(message.normalstatus != null)
             output.writeObject(5, message.normalstatus, CODEPHRASE.getSchema(), false);

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
