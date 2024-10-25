package com.forsale.app.ui.bottomsheets.attributes;

import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: AttributeOptionsViewModel.kt */
/* loaded from: classes3.dex */
public final class AttributeOptionsViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraAttributeOptionDao f38024a;

    /* renamed from: b  reason: collision with root package name */
    private final ApplicationResourcesRepository f38025b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineScope f38026c;

    /* renamed from: d  reason: collision with root package name */
    private List<ExtraAttributeOptionEntity> f38027d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<p> f38028e;

    /* renamed from: f  reason: collision with root package name */
    private final SharedFlow<p> f38029f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableSharedFlow<ExtraAttributeOptionEntity> f38030g;

    /* renamed from: h  reason: collision with root package name */
    private final SharedFlow<ExtraAttributeOptionEntity> f38031h;

    public AttributeOptionsViewModel(int i11, ExtraAttributeOptionDao optionsDao, ApplicationResourcesRepository resourceRepository, CoroutineScope scope) {
        o.i(optionsDao, "optionsDao");
        o.i(resourceRepository, "resourceRepository");
        o.i(scope, "scope");
        this.f38024a = optionsDao;
        this.f38025b = resourceRepository;
        this.f38026c = scope;
        this.f38027d = new ArrayList();
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38028e = MutableSharedFlow$default;
        this.f38029f = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<ExtraAttributeOptionEntity> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f38030g = MutableSharedFlow$default2;
        this.f38031h = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        g(i11);
    }

    private final void g(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f38026c, Dispatchers.getIO(), null, new AttributeOptionsViewModel$getOptions$1(this, i11, null), 2, null);
    }

    public final SharedFlow<p> d() {
        return this.f38029f;
    }

    public final SharedFlow<ExtraAttributeOptionEntity> e() {
        return this.f38031h;
    }

    public final List<ExtraAttributeOptionEntity> f() {
        return this.f38027d;
    }

    public final ApplicationResourcesRepository h() {
        return this.f38025b;
    }

    public final void i(List<ExtraAttributeOptionEntity> list) {
        o.i(list, "<set-?>");
        this.f38027d = list;
    }

    public final void j(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f38026c, null, null, new AttributeOptionsViewModel$setSelectedOption$1$1(this, this.f38027d.get(i11), null), 3, null);
    }
}
