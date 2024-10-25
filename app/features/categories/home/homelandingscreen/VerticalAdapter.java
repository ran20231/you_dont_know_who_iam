package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.fragment.app.Fragment;
import g00.l;
import kotlin.jvm.internal.o;
import kr.m;
import lr.c;
/* compiled from: VerticalAdapters.kt */
/* loaded from: classes2.dex */
public final class VerticalAdapter implements l<Fragment, c<x9.b<?>, m<?>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final VerticalAdapter f23825a = new VerticalAdapter();

    private VerticalAdapter() {
    }

    @Override // g00.l
    /* renamed from: b */
    public c<x9.b<?>, m<?>> invoke(final Fragment fragment) {
        o.i(fragment, "fragment");
        return new c<>(new l<x9.b<?>, m<?>>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.VerticalAdapter$invoke$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final m<?> invoke(x9.b<?> it2) {
                o.i(it2, "it");
                return ra.b.a(it2, Fragment.this);
            }
        });
    }
}
