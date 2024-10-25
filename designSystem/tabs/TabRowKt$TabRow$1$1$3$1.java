package com.forsale.designSystem.tabs;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.text.w;
import e2.d;
import e2.h;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TabRow.kt */
/* loaded from: classes3.dex */
public final class TabRowKt$TabRow$1$1$3$1 extends Lambda implements l<w, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SnapshotStateList<h> f42156a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42157b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ d f42158c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$TabRow$1$1$3$1(SnapshotStateList<h> snapshotStateList, int i11, d dVar) {
        super(1);
        this.f42156a = snapshotStateList;
        this.f42157b = i11;
        this.f42158c = dVar;
    }

    public final void b(w it2) {
        float p11;
        o.i(it2, "it");
        SnapshotStateList<h> snapshotStateList = this.f42156a;
        int i11 = this.f42157b;
        p11 = TabRowKt.p(it2, this.f42158c);
        snapshotStateList.set(i11, h.f(p11));
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(w wVar) {
        b(wVar);
        return p.f75480a;
    }
}
