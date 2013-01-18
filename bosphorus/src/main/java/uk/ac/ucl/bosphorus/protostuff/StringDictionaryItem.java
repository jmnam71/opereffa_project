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

public final class StringDictionaryItem implements Externalizable, Message<StringDictionaryItem>
{

    public static Schema<StringDictionaryItem> getSchema()
    {
        return SCHEMA;
    }

    public static StringDictionaryItem getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final StringDictionaryItem DEFAULT_INSTANCE = new StringDictionaryItem();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String value;
    String id;

    public StringDictionaryItem()
    {
        
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

    // id

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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

    public Schema<StringDictionaryItem> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<StringDictionaryItem> SCHEMA = new Schema<StringDictionaryItem>()
    {
        // schema methods

        public StringDictionaryItem newMessage()
        {
            return new StringDictionaryItem();
        }

        public Class<StringDictionaryItem> typeClass()
        {
            return StringDictionaryItem.class;
        }

        public String messageName()
        {
            return StringDictionaryItem.class.getSimpleName();
        }

        public String messageFullName()
        {
            return StringDictionaryItem.class.getName();
        }

        public boolean isInitialized(StringDictionaryItem message)
        {
            return true;
        }

        public void mergeFrom(Input input, StringDictionaryItem message) throws IOException
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
                    case 2:
                        message.id = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, StringDictionaryItem message) throws IOException
        {
            if(message.value != null)
                output.writeString(1, message.value, false);

            if(message.id != null)
                output.writeString(2, message.id, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "value";
                case 2: return "id";
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
            fieldMap.put("id", 2);
        }
    };
    
}
