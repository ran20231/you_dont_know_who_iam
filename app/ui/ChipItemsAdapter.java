package com.forsale.app.ui;

import androidx.lifecycle.s;
import g00.l;
import kotlin.jvm.internal.o;
import kr.m;
/* compiled from: ChipItemsAdapter.kt */
/* loaded from: classes3.dex */
public final class ChipItemsAdapter implements l<s, lr.c<x9.b<?>, m<?>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final ChipItemsAdapter f37825a = new ChipItemsAdapter();

    private ChipItemsAdapter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<?> e(x9.b<?> bVar, s sVar) {
        if (bVar instanceof li.b) {
            return new li.a((li.b) bVar, sVar);
        }
        if (bVar instanceof yh.b) {
            return new yh.a((yh.b) bVar, sVar);
        }
        return null;
    }

    @Override // g00.l
    /* renamed from: c */
    public lr.c<x9.b<?>, m<?>> invoke(final s lo2) {
        o.i(lo2, "lo");
        return new lr.c<>(new l<x9.b<?>, m<?>>() { // from class: com.forsale.app.ui.ChipItemsAdapter$invoke$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final m<?> invoke(x9.b<?> it2) {
                m<?> e11;
                o.i(it2, "it");
                e11 = ChipItemsAdapter.f37825a.e(it2, s.this);
                return e11;
            }
        });
    }
}
