package com.forsale.designSystem.bottomsheets;

import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r.f;
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
final class ModalBottomSheetState$Companion$Saver$2 extends Lambda implements l<ModalBottomSheetValue, ModalBottomSheetState> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f<Float> f40869a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f40870b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<ModalBottomSheetValue, Boolean> f40871c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetState$Companion$Saver$2(f<Float> fVar, boolean z11, l<? super ModalBottomSheetValue, Boolean> lVar) {
        super(1);
        this.f40869a = fVar;
        this.f40870b = z11;
        this.f40871c = lVar;
    }

    @Override // g00.l
    /* renamed from: b */
    public final ModalBottomSheetState invoke(ModalBottomSheetValue it2) {
        o.i(it2, "it");
        return new ModalBottomSheetState(it2, this.f40869a, this.f40870b, this.f40871c);
    }
}
