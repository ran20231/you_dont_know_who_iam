package com.forsale.app.utils.itemutils;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.z;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.itemutils.TextHolder;
import g00.a;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextHolder.kt */
/* loaded from: classes3.dex */
public final class TextHolder$titleTxt$2 extends Lambda implements a<z<String>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextHolder f40309a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextHolder$titleTxt$2(TextHolder textHolder) {
        super(0);
        this.f40309a = textHolder;
    }

    @Override // g00.a
    /* renamed from: b */
    public final z<String> invoke() {
        TextHolder.LocalizedText localizedText;
        TextHolder.LocalizedText localizedText2;
        String b11;
        TextHolder.LocalizedText localizedText3;
        localizedText = this.f40309a.f40298b;
        if (localizedText == null) {
            return null;
        }
        z<String> zVar = new z<>();
        TextHolder textHolder = this.f40309a;
        LocaleManager localeManager = LocaleManager.f39597a;
        if (localeManager.r()) {
            localizedText3 = textHolder.f40298b;
            b11 = localizedText3.a();
        } else {
            localizedText2 = textHolder.f40298b;
            b11 = localizedText2.b();
        }
        zVar.postValue(b11);
        zVar.b(FlowLiveDataConversions.c(localeManager.m(), null, 0L, 3, null), new TextHolder.b(new TextHolder$titleTxt$2$1$1(zVar, textHolder)));
        return zVar;
    }
}
