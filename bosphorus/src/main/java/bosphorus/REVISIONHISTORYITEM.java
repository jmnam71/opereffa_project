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

public final class REVISIONHISTORYITEM implements Externalizable, Message<REVISIONHISTORYITEM>, Schema<REVISIONHISTORYITEM>
{

    public static Schema<REVISIONHISTORYITEM> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static REVISIONHISTORYITEM getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final REVISIONHISTORYITEM DEFAULT_INSTANCE = new REVISIONHISTORYITEM();

    
    private OBJECTVERSIONID versionid;
    private List<AUDITDETAILS> audits;

    public REVISIONHISTORYITEM()
    {
        
    }

    public REVISIONHISTORYITEM(
        OBJECTVERSIONID versionid
    )
    {
        this.versionid = versionid;
    }

    // getters and setters

    // versionid

    public OBJECTVERSIONID getVersionid()
    {
        return versionid;
    }

    public void setVersionid(OBJECTVERSIONID versionid)
    {
        this.versionid = versionid;
    }

    // audits

    public List<AUDITDETAILS> getAuditsList()
    {
        return audits;
    }

    public void setAuditsList(List<AUDITDETAILS> audits)
    {
        this.audits = audits;
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

    public Schema<REVISIONHISTORYITEM> cachedSchema()
    {
        return this;
    }

    // schema methods

    public REVISIONHISTORYITEM newMessage()
    {
        return new REVISIONHISTORYITEM();
    }

    public Class<REVISIONHISTORYITEM> typeClass()
    {
        return REVISIONHISTORYITEM.class;
    }

    public String messageName()
    {
        return REVISIONHISTORYITEM.class.getSimpleName();
    }

    public String messageFullName()
    {
        return REVISIONHISTORYITEM.class.getName();
    }

    public boolean isInitialized(REVISIONHISTORYITEM message)
    {
        return 
            message.versionid != null;
    }

    public void mergeFrom(Input input, REVISIONHISTORYITEM message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.versionid = input.mergeObject(message.versionid, OBJECTVERSIONID.getSchema());
                    break;

                case 2:
                    if(message.audits == null)
                        message.audits = new ArrayList<AUDITDETAILS>();
                    message.audits.add(input.mergeObject(null, AUDITDETAILS.getSchema()));
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, REVISIONHISTORYITEM message) throws IOException
    {
        if(message.versionid == null)
            throw new UninitializedMessageException(message);
        output.writeObject(1, message.versionid, OBJECTVERSIONID.getSchema(), false);


        if(message.audits != null)
        {
            for(AUDITDETAILS audits : message.audits)
            {
                if(audits != null)
                    output.writeObject(2, audits, AUDITDETAILS.getSchema(), true);
            }
        }

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
