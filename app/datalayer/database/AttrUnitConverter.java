package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: AttrUnitConverter.kt */
/* loaded from: classes2.dex */
public final class AttrUnitConverter {
    public static final int $stable = 0;

    public final ExtraAttributeEntity.AttrUnit toAttrUnit(String str) {
        if (str != null) {
            return (ExtraAttributeEntity.AttrUnit) new d().l(str, new a<ExtraAttributeEntity.AttrUnit>() { // from class: com.forsale.app.datalayer.database.AttrUnitConverter$toAttrUnit$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(ExtraAttributeEntity.AttrUnit attrUnit) {
        String str;
        if (attrUnit != null) {
            str = new d().t(attrUnit);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
