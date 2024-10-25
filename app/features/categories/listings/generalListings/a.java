package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import java.util.List;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ExtraParameters.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f30522a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30523b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Integer> f30524c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30525d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f30526e;

    /* renamed from: f  reason: collision with root package name */
    private final AdvancedSearchBody f30527f;

    /* renamed from: g  reason: collision with root package name */
    private final StateFlow<MyListingsType> f30528g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f30529h;

    /* JADX WARN: Multi-variable type inference failed */
    public a(Integer num, String str, List<Integer> list, String str2, Integer num2, AdvancedSearchBody advancedSearchBody, StateFlow<? extends MyListingsType> stateFlow, Integer num3) {
        this.f30522a = num;
        this.f30523b = str;
        this.f30524c = list;
        this.f30525d = str2;
        this.f30526e = num2;
        this.f30527f = advancedSearchBody;
        this.f30528g = stateFlow;
        this.f30529h = num3;
    }

    public final Integer a() {
        return this.f30526e;
    }

    public final Integer b() {
        return this.f30529h;
    }

    public final List<Integer> c() {
        return this.f30524c;
    }

    public final StateFlow<MyListingsType> d() {
        return this.f30528g;
    }

    public final String e() {
        return this.f30525d;
    }

    public final AdvancedSearchBody f() {
        return this.f30527f;
    }

    public final Integer g() {
        return this.f30522a;
    }

    public final String h() {
        return this.f30523b;
    }
}
