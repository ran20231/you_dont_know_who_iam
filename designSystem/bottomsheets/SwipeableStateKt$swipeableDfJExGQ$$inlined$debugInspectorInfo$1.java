package com.forsale.designSystem.bottomsheets;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.platform.q1;
import com.leanplum.internal.Constants;
import e2.h;
import g00.l;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import v.k;
import vj.b;
import wz.p;
/* compiled from: InspectableValue.kt */
/* renamed from: com.forsale.designSystem.bottomsheets.SwipeableStateKt$swipeable-DfJExGQ$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes3.dex */
public final class SwipeableStateKt$swipeableDfJExGQ$$inlined$debugInspectorInfo$1 extends Lambda implements l<q1, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SwipeableState f40945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map f40946b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Orientation f40947c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f40948d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f40949e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f40950f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ g00.p f40951g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ b f40952h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ float f40953i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableStateKt$swipeableDfJExGQ$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z11, boolean z12, k kVar, g00.p pVar, b bVar, float f11) {
        super(1);
        this.f40945a = swipeableState;
        this.f40946b = map;
        this.f40947c = orientation;
        this.f40948d = z11;
        this.f40949e = z12;
        this.f40950f = kVar;
        this.f40951g = pVar;
        this.f40952h = bVar;
        this.f40953i = f11;
    }

    public final void b(q1 q1Var) {
        q1Var.b("swipeable");
        q1Var.a().b(Constants.Params.STATE, this.f40945a);
        q1Var.a().b("anchors", this.f40946b);
        q1Var.a().b("orientation", this.f40947c);
        q1Var.a().b("enabled", Boolean.valueOf(this.f40948d));
        q1Var.a().b("reverseDirection", Boolean.valueOf(this.f40949e));
        q1Var.a().b("interactionSource", this.f40950f);
        q1Var.a().b("thresholds", this.f40951g);
        q1Var.a().b("resistance", this.f40952h);
        q1Var.a().b("velocityThreshold", h.f(this.f40953i));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(q1 q1Var) {
        b(q1Var);
        return p.f75480a;
    }
}
