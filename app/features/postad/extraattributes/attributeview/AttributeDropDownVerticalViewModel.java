package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.utils.TypeExtensionsKt;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.y0;
import wz.p;
/* compiled from: AttributeDropDownVerticalViewModel.kt */
/* loaded from: classes2.dex */
public final class AttributeDropDownVerticalViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraAttributeFlatGroupEntity f35287a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtraAttributeOptionDao f35288b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f35289c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedFlow<p> f35290d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineScope f35291e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<ExtraAttributeOptionEntity> f35292f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<ExtraAttributeOptionEntity> f35293g;

    /* renamed from: h  reason: collision with root package name */
    private final ObservableField<String> f35294h;

    /* renamed from: i  reason: collision with root package name */
    private final ObservableField<Integer> f35295i;

    /* renamed from: j  reason: collision with root package name */
    private final ObservableBoolean f35296j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<p> f35297k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<p> f35298l;

    public AttributeDropDownVerticalViewModel(ExtraAttributeFlatGroupEntity attribute, ExtraAttributeOptionDao optionsDao, ApplicationResourcesRepository resourceRepository, SharedFlow<p> validateAttribute, CoroutineScope scope) {
        o.i(attribute, "attribute");
        o.i(optionsDao, "optionsDao");
        o.i(resourceRepository, "resourceRepository");
        o.i(validateAttribute, "validateAttribute");
        o.i(scope, "scope");
        this.f35287a = attribute;
        this.f35288b = optionsDao;
        this.f35289c = resourceRepository;
        this.f35290d = validateAttribute;
        this.f35291e = scope;
        MutableSharedFlow<ExtraAttributeOptionEntity> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35292f = MutableSharedFlow$default;
        this.f35293g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f35294h = new ObservableField<>();
        this.f35295i = new ObservableField<>();
        this.f35296j = new ObservableBoolean(TypeExtensionsKt.h0(attribute.isRequired()));
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35297k = MutableSharedFlow$default2;
        this.f35298l = FlowKt.asSharedFlow(MutableSharedFlow$default2);
    }

    public final ExtraAttributeFlatGroupEntity d() {
        return this.f35287a;
    }

    public final SharedFlow<ExtraAttributeOptionEntity> e() {
        return this.f35293g;
    }

    public final Pair<Integer, String> f() {
        return new Pair<>(-1, this.f35289c.getString(y0.Ca, new Object[0]));
    }

    public final SharedFlow<p> g() {
        return this.f35298l;
    }

    public final void h(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this.f35291e, Dispatchers.getIO(), null, new AttributeDropDownVerticalViewModel$getOption$1(this, i11, null), 2, null);
    }

    public final ObservableField<String> i() {
        return this.f35294h;
    }

    public final ObservableField<Integer> j() {
        return this.f35295i;
    }

    public final SharedFlow<p> k() {
        return this.f35290d;
    }

    public final ObservableBoolean l() {
        return this.f35296j;
    }

    public final void m() {
        BuildersKt__Builders_commonKt.launch$default(this.f35291e, null, null, new AttributeDropDownVerticalViewModel$onClicked$1(this, null), 3, null);
    }
}
