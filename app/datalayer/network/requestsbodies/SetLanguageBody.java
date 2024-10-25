package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SetLanguageBody.kt */
/* loaded from: classes2.dex */
public final class SetLanguageBody {
    public static final int $stable = 0;
    @c("language")
    private final Languages language;

    public SetLanguageBody(Languages language) {
        o.i(language, "language");
        this.language = language;
    }

    public static /* synthetic */ SetLanguageBody copy$default(SetLanguageBody setLanguageBody, Languages languages, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            languages = setLanguageBody.language;
        }
        return setLanguageBody.copy(languages);
    }

    public final Languages component1() {
        return this.language;
    }

    public final SetLanguageBody copy(Languages language) {
        o.i(language, "language");
        return new SetLanguageBody(language);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetLanguageBody) && this.language == ((SetLanguageBody) obj).language) {
            return true;
        }
        return false;
    }

    public final Languages getLanguage() {
        return this.language;
    }

    public int hashCode() {
        return this.language.hashCode();
    }

    public String toString() {
        Languages languages = this.language;
        return "SetLanguageBody(language=" + languages + ")";
    }
}
