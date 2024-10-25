package com.forsale.app.utils.analytics.listingfiltration;

import g00.l;
import java.util.List;
import java.util.Map;
import kotlin.collections.l0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import o00.f;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: ListingsFiltrationAnalytics.kt */
/* loaded from: classes3.dex */
final class ListingsFiltrationAnalytics$group$1<K, V> extends Lambda implements l<Map<K, ? extends List<? extends V>>, f<? extends Map.Entry<? extends K, ? extends List<? extends V>>>> {

    /* renamed from: a  reason: collision with root package name */
    public static final ListingsFiltrationAnalytics$group$1 f40042a = new ListingsFiltrationAnalytics$group$1();

    ListingsFiltrationAnalytics$group$1() {
        super(1);
    }

    @Override // g00.l
    /* renamed from: b */
    public final f<Map.Entry<K, List<V>>> invoke(Map<K, ? extends List<? extends V>> it2) {
        f<Map.Entry<K, List<V>>> z11;
        o.i(it2, "it");
        z11 = l0.z(it2);
        return z11;
    }
}
