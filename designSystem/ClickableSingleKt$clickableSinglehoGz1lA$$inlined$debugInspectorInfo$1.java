package com.forsale.designSystem;

import androidx.compose.ui.platform.q1;
import g00.l;
import kotlin.jvm.internal.Lambda;
import q1.i;
import s.n;
import v.k;
import wz.p;
/* compiled from: InspectableValue.kt */
/* renamed from: com.forsale.designSystem.ClickableSingleKt$clickableSingle-hoGz1lA$$inlined$debugInspectorInfo$1  reason: invalid class name */
/* loaded from: classes3.dex */
public final class ClickableSingleKt$clickableSinglehoGz1lA$$inlined$debugInspectorInfo$1 extends Lambda implements l<q1, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f40630a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40631b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ i f40632c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.a f40633d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ n f40634e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k f40635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableSingleKt$clickableSinglehoGz1lA$$inlined$debugInspectorInfo$1(boolean z11, String str, i iVar, g00.a aVar, n nVar, k kVar) {
        super(1);
        this.f40630a = z11;
        this.f40631b = str;
        this.f40632c = iVar;
        this.f40633d = aVar;
        this.f40634e = nVar;
        this.f40635f = kVar;
    }

    public final void b(q1 q1Var) {
        q1Var.b("clickable");
        q1Var.a().b("enabled", Boolean.valueOf(this.f40630a));
        q1Var.a().b("onClickLabel", this.f40631b);
        q1Var.a().b("role", this.f40632c);
        q1Var.a().b("onClick", this.f40633d);
        q1Var.a().b("indication", this.f40634e);
        q1Var.a().b("interactionSource", this.f40635f);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(q1 q1Var) {
        b(q1Var);
        return p.f75480a;
    }
}
