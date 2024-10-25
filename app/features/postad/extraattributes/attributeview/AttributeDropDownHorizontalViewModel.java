package com.forsale.app.features.postad.extraattributes.attributeview;

import androidx.databinding.ObservableBoolean;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import t9.o0;
import wz.p;
/* compiled from: AttributeDropDownHorizontalViewModel.kt */
/* loaded from: classes2.dex */
public final class AttributeDropDownHorizontalViewModel implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final ExtraAttributeFlatGroupEntity f35240a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtraAttributeOptionDao f35241b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f35242c;

    /* renamed from: d  reason: collision with root package name */
    private final SharedFlow<p> f35243d;

    /* renamed from: e  reason: collision with root package name */
    private final CoroutineContext f35244e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<List<ExtraAttributeOptionEntity>> f35245f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<List<ExtraAttributeOptionEntity>> f35246g;

    /* renamed from: h  reason: collision with root package name */
    private final ObservableBoolean f35247h;

    public AttributeDropDownHorizontalViewModel(ExtraAttributeFlatGroupEntity attribute, ExtraAttributeOptionDao optionsDao, ApplicationResourcesRepository resourcesRepository, SharedFlow<p> validateAttribute) {
        o.i(attribute, "attribute");
        o.i(optionsDao, "optionsDao");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(validateAttribute, "validateAttribute");
        this.f35240a = attribute;
        this.f35241b = optionsDao;
        this.f35242c = resourcesRepository;
        this.f35243d = validateAttribute;
        this.f35244e = Dispatchers.getIO();
        MutableSharedFlow<List<ExtraAttributeOptionEntity>> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35245f = MutableSharedFlow$default;
        this.f35246g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f35247h = new ObservableBoolean(TypeExtensionsKt.h0(attribute.isRequired()));
    }

    public final ExtraAttributeFlatGroupEntity c() {
        return this.f35240a;
    }

    public final SharedFlow<List<ExtraAttributeOptionEntity>> d() {
        return this.f35246g;
    }

    public final void e(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getIO(), null, new AttributeDropDownHorizontalViewModel$getOptions$1(this, i11, null), 2, null);
    }

    public final int f() {
        if (h()) {
            return this.f35242c.getColor(o0.A);
        }
        return this.f35242c.getColor(o0.f69331h);
    }

    public final SharedFlow<p> g() {
        return this.f35243d;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f35244e;
    }

    public final boolean h() {
        if (this.f35247h.j() && this.f35240a.getOptionId() == 0) {
            return true;
        }
        return false;
    }

    public final ObservableBoolean j() {
        return this.f35247h;
    }
}
