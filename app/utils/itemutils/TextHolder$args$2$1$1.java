package com.forsale.app.utils.itemutils;

import androidx.lifecycle.z;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import wz.p;
/* compiled from: TextHolder.kt */
/* loaded from: classes3.dex */
final class TextHolder$args$2$1$1 extends Lambda implements l<String, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z<List<Object>> f40306a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TextHolder f40307b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextHolder$args$2$1$1(z<List<Object>> zVar, TextHolder textHolder) {
        super(1);
        this.f40306a = zVar;
        this.f40307b = textHolder;
    }

    public final void b(String str) {
        List<Object> list;
        z<List<Object>> zVar = this.f40306a;
        list = this.f40307b.f40299c;
        zVar.setValue(list);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(String str) {
        b(str);
        return p.f75480a;
    }
}
