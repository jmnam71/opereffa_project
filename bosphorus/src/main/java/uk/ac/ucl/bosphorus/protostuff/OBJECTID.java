/*******************************************************************************
 * Copyright 2012 Sevket Seref Arikan, David Ingram
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from aom.proto

package uk.ac.ucl.bosphorus.protostuff;

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

public final class OBJECTID implements Externalizable, Message<OBJECTID>
{

    public static Schema<OBJECTID> getSchema()
    {
        return SCHEMA;
    }

    public static OBJECTID getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final OBJECTID DEFAULT_INSTANCE = new OBJECTID();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String value;

    public OBJECTID()
    {
        
    }

    public OBJECTID(
        String value
    )
    {
        this.value = value;
    }

    // getters and setters

    // value

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<OBJECTID> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<OBJECTID> SCHEMA = new Schema<OBJECTID>()
    {
        // schema methods

        public OBJECTID newMessage()
        {
            return new OBJECTID();
        }

        public Class<OBJECTID> typeClass()
        {
            return OBJECTID.class;
        }

        public String messageName()
        {
            return OBJECTID.class.getSimpleName();
        }

        public String messageFullName()
        {
            return OBJECTID.class.getName();
        }

        public boolean isInitialized(OBJECTID message)
        {
            return 
                message.value != null;
        }

        public void mergeFrom(Input input, OBJECTID message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.value = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, OBJECTID message) throws IOException
        {
            if(message.value == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.value, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "value";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("value", 1);
        }
    };
    
}
