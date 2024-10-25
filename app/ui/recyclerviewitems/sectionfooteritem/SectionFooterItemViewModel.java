package com.forsale.app.ui.recyclerviewitems.sectionfooteritem;

import g00.l;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: SectionFooterItemViewModel.kt */
/* loaded from: classes3.dex */
public final class SectionFooterItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f39498a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39499b;

    /* renamed from: c  reason: collision with root package name */
    private final int f39500c;

    /* renamed from: d  reason: collision with root package name */
    private final l<Boolean, p> f39501d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f39502e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Boolean> f39503f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f39504g;

    /* JADX WARN: Multi-variable type inference failed */
    public SectionFooterItemViewModel(CoroutineScope coroutineScope, boolean z11, int i11, l<? super Boolean, p> onToggle) {
        o.i(coroutineScope, "coroutineScope");
        o.i(onToggle, "onToggle");
        this.f39498a = coroutineScope;
        this.f39499b = z11;
        this.f39500c = i11;
        this.f39501d = onToggle;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.valueOf(z11));
        this.f39502e = MutableStateFlow;
        this.f39503f = FlowKt.asStateFlow(MutableStateFlow);
        this.f39504g = i11 > 1;
    }

    public final boolean b() {
        return this.f39504g;
    }

    public final StateFlow<Boolean> c() {
        return this.f39503f;
    }

    public final boolean d() {
        return this.f39499b;
    }

    public final void e() {
        this.f39501d.invoke(Boolean.valueOf(!this.f39499b));
        BuildersKt__Builders_commonKt.launch$default(this.f39498a, null, null, new SectionFooterItemViewModel$toggleView$1(this, null), 3, null);
    }
}
