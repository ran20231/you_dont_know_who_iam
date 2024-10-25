package com.forsale.app.utils.itemutils;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.z;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.itemutils.TextHolder;
import g00.a;
import java.util.List;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextHolder.kt */
/* loaded from: classes3.dex */
public final class TextHolder$args$2 extends Lambda implements a<z<List<? extends Object>>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TextHolder f40305a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextHolder$args$2(TextHolder textHolder) {
        super(0);
        this.f40305a = textHolder;
    }

    @Override // g00.a
    /* renamed from: b */
    public final z<List<Object>> invoke() {
        List list;
        List<Object> list2;
        list = this.f40305a.f40299c;
        if (list == null) {
            return null;
        }
        z<List<Object>> zVar = new z<>();
        TextHolder textHolder = this.f40305a;
        list2 = textHolder.f40299c;
        zVar.setValue(list2);
        zVar.b(FlowLiveDataConversions.c(LocaleManager.f39597a.m(), null, 0L, 3, null), new TextHolder.b(new TextHolder$args$2$1$1(zVar, textHolder)));
        return zVar;
    }
}
