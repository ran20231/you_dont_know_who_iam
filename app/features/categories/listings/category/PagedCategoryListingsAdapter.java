package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.s;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import g00.l;
import kotlin.jvm.internal.o;
import kr.m;
/* compiled from: CategoryListingsAdapters.kt */
/* loaded from: classes2.dex */
public final class PagedCategoryListingsAdapter implements l<s, rr.a<x9.b<?>, m<?>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final PagedCategoryListingsAdapter f28629a = new PagedCategoryListingsAdapter();

    /* renamed from: b  reason: collision with root package name */
    private static final androidx.recyclerview.widget.c<x9.b<?>> f28630b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f28631c;

    /* compiled from: CategoryListingsAdapters.kt */
    /* loaded from: classes2.dex */
    public static final class a extends h.f<x9.b<?>> {
        a() {
        }

        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: a */
        public boolean areContentsTheSame(x9.b<?> oldItem, x9.b<?> newItem) {
            o.i(oldItem, "oldItem");
            o.i(newItem, "newItem");
            return o.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.h.f
        /* renamed from: b */
        public boolean areItemsTheSame(x9.b<?> oldItem, x9.b<?> newItem) {
            o.i(oldItem, "oldItem");
            o.i(newItem, "newItem");
            return o.d(oldItem, newItem);
        }
    }

    static {
        androidx.recyclerview.widget.c<x9.b<?>> a11 = new c.a(new a()).a();
        o.h(a11, "build(...)");
        f28630b = a11;
        f28631c = 8;
    }

    private PagedCategoryListingsAdapter() {
    }

    @Override // g00.l
    /* renamed from: b */
    public rr.a<x9.b<?>, m<?>> invoke(final s lo2) {
        o.i(lo2, "lo");
        return new rr.a<>(f28630b, null, new l<x9.b<?>, m<?>>() { // from class: com.forsale.app.features.categories.listings.category.PagedCategoryListingsAdapter$invoke$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // g00.l
            /* renamed from: b */
            public final m<?> invoke(x9.b<?> bVar) {
                o.f(bVar);
                return zb.a.a(bVar, s.this);
            }
        }, 2, null);
    }
}
