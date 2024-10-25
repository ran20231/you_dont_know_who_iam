package com.forsale.app.features.postad.extraattributes.attributesgroupitem;

import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import java.io.File;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
import zz.a;
/* compiled from: AttributesGroupItemViewModel.kt */
/* loaded from: classes2.dex */
public final class AttributesGroupItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final List<ExtraAttributeFlatGroupEntity> f35188a;

    /* renamed from: b  reason: collision with root package name */
    private final Boolean f35189b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35190c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<p> f35191d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<p> f35192e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<p> f35193f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<p> f35194g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<p> f35195h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<p> f35196i;

    /* renamed from: j  reason: collision with root package name */
    private final MutableSharedFlow<p> f35197j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow<p> f35198k;

    /* renamed from: l  reason: collision with root package name */
    private final MutableSharedFlow<p> f35199l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<p> f35200m;

    /* renamed from: n  reason: collision with root package name */
    private final MutableStateFlow<File> f35201n;

    /* renamed from: o  reason: collision with root package name */
    private final StateFlow<File> f35202o;

    public AttributesGroupItemViewModel(List<ExtraAttributeFlatGroupEntity> attributes, Boolean bool, String str) {
        o.i(attributes, "attributes");
        this.f35188a = attributes;
        this.f35189b = bool;
        this.f35190c = str;
        MutableSharedFlow<p> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35191d = MutableSharedFlow$default;
        this.f35192e = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<p> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35193f = MutableSharedFlow$default2;
        this.f35194g = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35195h = MutableSharedFlow$default3;
        this.f35196i = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<p> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35197j = MutableSharedFlow$default4;
        this.f35198k = FlowKt.asSharedFlow(MutableSharedFlow$default4);
        MutableSharedFlow<p> MutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f35199l = MutableSharedFlow$default5;
        this.f35200m = FlowKt.asSharedFlow(MutableSharedFlow$default5);
        MutableStateFlow<File> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f35201n = MutableStateFlow;
        this.f35202o = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final double c(String str) {
        if (o.d(str, ".")) {
            str = "0.";
        }
        return Double.parseDouble(str);
    }

    private final boolean j(ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity) {
        Double d11;
        boolean z11;
        String textNumValue = extraAttributeFlatGroupEntity.getTextNumValue();
        p pVar = null;
        if (textNumValue != null) {
            d11 = Double.valueOf(c(textNumValue));
        } else {
            d11 = null;
        }
        if (d11 != null) {
            d11.doubleValue();
            if (d11.doubleValue() <= extraAttributeFlatGroupEntity.getMax() && d11.doubleValue() >= extraAttributeFlatGroupEntity.getMin()) {
                z11 = true;
            } else {
                z11 = false;
            }
            extraAttributeFlatGroupEntity.setValid(z11);
            pVar = p.f75480a;
        }
        if (pVar == null) {
            extraAttributeFlatGroupEntity.setValid(true);
        }
        return extraAttributeFlatGroupEntity.isValid();
    }

    public final List<ExtraAttributeFlatGroupEntity> a() {
        return this.f35188a;
    }

    public final String b() {
        return this.f35190c;
    }

    public final StateFlow<File> d() {
        return this.f35202o;
    }

    public final SharedFlow<p> e() {
        return this.f35200m;
    }

    public final SharedFlow<p> f() {
        return this.f35198k;
    }

    public final SharedFlow<p> g() {
        return this.f35194g;
    }

    public final SharedFlow<p> h() {
        return this.f35192e;
    }

    public final SharedFlow<p> i() {
        return this.f35196i;
    }

    public final Boolean k() {
        return this.f35189b;
    }

    public final Object l(File file, a<? super p> aVar) {
        Object f11;
        Object emit = this.f35201n.emit(file, aVar);
        f11 = b.f();
        if (emit == f11) {
            return emit;
        }
        return p.f75480a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01e0 -> B:104:0x01e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0100 -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0102 -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0142 -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x015f -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0164 -> B:22:0x0088). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01bf -> B:22:0x0088). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(zz.a<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel.m(zz.a):java.lang.Object");
    }
}
