package com.forsale.app.utils.itemutils;

import androidx.lifecycle.z;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.utils.itemutils.TextHolder;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: TextHolder.kt */
/* loaded from: classes3.dex */
final class TextHolder$titleTxt$2$1$1 extends Lambda implements l<String, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z<String> f40310a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextHolder f40311b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextHolder$titleTxt$2$1$1(z<String> zVar, TextHolder textHolder) {
        super(1);
        this.f40310a = zVar;
        this.f40311b = textHolder;
    }

    public final void b(String str) {
        TextHolder.LocalizedText localizedText;
        String b11;
        TextHolder.LocalizedText localizedText2;
        z<String> zVar = this.f40310a;
        if (o.d(str, SearchPlaceholderKeywordEntity.AR)) {
            localizedText2 = this.f40311b.f40298b;
            b11 = localizedText2.a();
        } else {
            localizedText = this.f40311b.f40298b;
            b11 = localizedText.b();
        }
        zVar.setValue(b11);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(String str) {
        b(str);
        return p.f75480a;
    }
}
