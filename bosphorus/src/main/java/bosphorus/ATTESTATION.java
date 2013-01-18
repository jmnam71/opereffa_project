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

public final class ATTESTATION implements Externalizable, Message<ATTESTATION>, Schema<ATTESTATION>
{

    public static Schema<ATTESTATION> getSchema()
    {
        return DEFAULT_INSTANCE;
    }

    public static ATTESTATION getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final ATTESTATION DEFAULT_INSTANCE = new ATTESTATION();

    
    private DVMULTIMEDIA attestedview;
    private String proof;
    private List<DVEHRURI> items;
    private DVTEXT reason;
    private Boolean ispending;
    private String systemid;
    private PARTYPROXYALTERNATIVES committer;
    private DVDATETIME timecommitted;
    private DVCODEDTEXT changetype;
    private DVTEXT description;

    public ATTESTATION()
    {
        
    }

    public ATTESTATION(
        DVTEXT reason,
        String systemid,
        PARTYPROXYALTERNATIVES committer,
        DVDATETIME timecommitted,
        DVCODEDTEXT changetype
    )
    {
        this.reason = reason;
        this.systemid = systemid;
        this.committer = committer;
        this.timecommitted = timecommitted;
        this.changetype = changetype;
    }

    // getters and setters

    // attestedview

    public DVMULTIMEDIA getAttestedview()
    {
        return attestedview;
    }

    public void setAttestedview(DVMULTIMEDIA attestedview)
    {
        this.attestedview = attestedview;
    }

    // proof

    public String getProof()
    {
        return proof;
    }

    public void setProof(String proof)
    {
        this.proof = proof;
    }

    // items

    public List<DVEHRURI> getItemsList()
    {
        return items;
    }

    public void setItemsList(List<DVEHRURI> items)
    {
        this.items = items;
    }

    // reason

    public DVTEXT getReason()
    {
        return reason;
    }

    public void setReason(DVTEXT reason)
    {
        this.reason = reason;
    }

    // ispending

    public Boolean getIspending()
    {
        return ispending;
    }

    public void setIspending(Boolean ispending)
    {
        this.ispending = ispending;
    }

    // systemid

    public String getSystemid()
    {
        return systemid;
    }

    public void setSystemid(String systemid)
    {
        this.systemid = systemid;
    }

    // committer

    public PARTYPROXYALTERNATIVES getCommitter()
    {
        return committer;
    }

    public void setCommitter(PARTYPROXYALTERNATIVES committer)
    {
        this.committer = committer;
    }

    // timecommitted

    public DVDATETIME getTimecommitted()
    {
        return timecommitted;
    }

    public void setTimecommitted(DVDATETIME timecommitted)
    {
        this.timecommitted = timecommitted;
    }

    // changetype

    public DVCODEDTEXT getChangetype()
    {
        return changetype;
    }

    public void setChangetype(DVCODEDTEXT changetype)
    {
        this.changetype = changetype;
    }

    // description

    public DVTEXT getDescription()
    {
        return description;
    }

    public void setDescription(DVTEXT description)
    {
        this.description = description;
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

    public Schema<ATTESTATION> cachedSchema()
    {
        return this;
    }

    // schema methods

    public ATTESTATION newMessage()
    {
        return new ATTESTATION();
    }

    public Class<ATTESTATION> typeClass()
    {
        return ATTESTATION.class;
    }

    public String messageName()
    {
        return ATTESTATION.class.getSimpleName();
    }

    public String messageFullName()
    {
        return ATTESTATION.class.getName();
    }

    public boolean isInitialized(ATTESTATION message)
    {
        return 
            message.reason != null 
            && message.systemid != null 
            && message.committer != null 
            && message.timecommitted != null 
            && message.changetype != null;
    }

    public void mergeFrom(Input input, ATTESTATION message) throws IOException
    {
        for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
        {
            switch(number)
            {
                case 0:
                    return;
                case 1:
                    message.attestedview = input.mergeObject(message.attestedview, DVMULTIMEDIA.getSchema());
                    break;

                case 2:
                    message.proof = input.readString();
                    break;
                case 3:
                    if(message.items == null)
                        message.items = new ArrayList<DVEHRURI>();
                    message.items.add(input.mergeObject(null, DVEHRURI.getSchema()));
                    break;

                case 4:
                    message.reason = input.mergeObject(message.reason, DVTEXT.getSchema());
                    break;

                case 5:
                    message.ispending = input.readBool();
                    break;
                case 6:
                    message.systemid = input.readString();
                    break;
                case 7:
                    message.committer = input.mergeObject(message.committer, PARTYPROXYALTERNATIVES.getSchema());
                    break;

                case 8:
                    message.timecommitted = input.mergeObject(message.timecommitted, DVDATETIME.getSchema());
                    break;

                case 9:
                    message.changetype = input.mergeObject(message.changetype, DVCODEDTEXT.getSchema());
                    break;

                case 10:
                    message.description = input.mergeObject(message.description, DVTEXT.getSchema());
                    break;

                default:
                    input.handleUnknownField(number, this);
            }   
        }
    }


    public void writeTo(Output output, ATTESTATION message) throws IOException
    {
        if(message.attestedview != null)
             output.writeObject(1, message.attestedview, DVMULTIMEDIA.getSchema(), false);


        if(message.proof != null)
            output.writeString(2, message.proof, false);

        if(message.items != null)
        {
            for(DVEHRURI items : message.items)
            {
                if(items != null)
                    output.writeObject(3, items, DVEHRURI.getSchema(), true);
            }
        }


        if(message.reason == null)
            throw new UninitializedMessageException(message);
        output.writeObject(4, message.reason, DVTEXT.getSchema(), false);


        if(message.ispending != null)
            output.writeBool(5, message.ispending, false);

        if(message.systemid == null)
            throw new UninitializedMessageException(message);
        output.writeString(6, message.systemid, false);

        if(message.committer == null)
            throw new UninitializedMessageException(message);
        output.writeObject(7, message.committer, PARTYPROXYALTERNATIVES.getSchema(), false);


        if(message.timecommitted == null)
            throw new UninitializedMessageException(message);
        output.writeObject(8, message.timecommitted, DVDATETIME.getSchema(), false);


        if(message.changetype == null)
            throw new UninitializedMessageException(message);
        output.writeObject(9, message.changetype, DVCODEDTEXT.getSchema(), false);


        if(message.description != null)
             output.writeObject(10, message.description, DVTEXT.getSchema(), false);

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
