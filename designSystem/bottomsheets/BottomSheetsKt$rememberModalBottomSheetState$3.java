package com.forsale.designSystem.bottomsheets;

import g00.a;
import g00.l;
import kotlin.jvm.internal.Lambda;
import r.f;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class BottomSheetsKt$rememberModalBottomSheetState$3 extends Lambda implements a<ModalBottomSheetState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetValue f40861a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f<Float> f40862b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f40863c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ l<ModalBottomSheetValue, Boolean> f40864d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$rememberModalBottomSheetState$3(ModalBottomSheetValue modalBottomSheetValue, f<Float> fVar, boolean z11, l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(0);
        this.f40861a = modalBottomSheetValue;
        this.f40862b = fVar;
        this.f40863c = z11;
        this.f40864d = lVar;
    }

    @Override // g00.a
    /* renamed from: b */
    public final ModalBottomSheetState invoke() {
        return new ModalBottomSheetState(this.f40861a, this.f40862b, this.f40863c, this.f40864d);
    }
}
