package com.forsale.app.features.search;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.r0;
/* compiled from: SearchSharedViewModel.kt */
/* loaded from: classes2.dex */
public final class SearchSharedViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final String f36822k0;

    /* renamed from: l0  reason: collision with root package name */
    private final MutableSharedFlow<String> f36823l0;

    /* renamed from: m0  reason: collision with root package name */
    private final SharedFlow<String> f36824m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f36825n0;

    /* renamed from: o0  reason: collision with root package name */
    private final SharedFlow<Boolean> f36826o0;

    /* compiled from: SearchSharedViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        SearchSharedViewModel a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchSharedViewModel(BaseRepository baseRepository, String str) {
        super(baseRepository);
        kotlin.jvm.internal.o.i(baseRepository, "baseRepository");
        this.f36822k0 = str;
        MutableSharedFlow<String> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f36823l0 = MutableSharedFlow$default;
        this.f36824m0 = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<Boolean> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f36825n0 = MutableSharedFlow$default2;
        this.f36826o0 = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        D0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean B0(int i11) {
        if (i11 == r0.B3 || i11 == r0.Y1) {
            return true;
        }
        return false;
    }

    private final void y0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new SearchSharedViewModel$decideNonFocusSearchBarVisibility$1(this, i11, null), 3, null);
    }

    public final SharedFlow<String> A0() {
        return this.f36824m0;
    }

    public final void C0(int i11) {
        y0(i11);
    }

    public final void D0(String str) {
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.r0.a(this), null, null, new SearchSharedViewModel$setSearchKeyword$1(this, str, null), 3, null);
        }
    }

    public final SharedFlow<Boolean> z0() {
        return this.f36826o0;
    }
}
