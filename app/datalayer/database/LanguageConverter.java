package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.google.gson.d;
import com.google.gson.reflect.a;
/* compiled from: LanguageConverter.kt */
/* loaded from: classes2.dex */
public final class LanguageConverter {
    public static final int $stable = 0;

    public final Languages toLanguages(String str) {
        if (str != null) {
            return (Languages) new d().l(str, new a<Languages>() { // from class: com.forsale.app.datalayer.database.LanguageConverter$toLanguages$1$1
            }.getType());
        }
        return null;
    }

    public final String toString(Languages languages) {
        String str;
        if (languages != null) {
            str = new d().t(languages);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
