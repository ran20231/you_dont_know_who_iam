package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import g00.q;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheets.kt */
/* loaded from: classes3.dex */
public final class BottomSheetsKt$ModalBottomSheetLayout$5 extends Lambda implements p<a, Integer, wz.p> {
    final /* synthetic */ int A;
    final /* synthetic */ int B;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f42272a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f42273b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42274c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f42275d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, a, Integer, wz.p> f42276e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42277f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42278g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f42279h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ long f42280i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f42281j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42282x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42283y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ int f42284z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetsKt$ModalBottomSheetLayout$5(c cVar, Integer num, g00.a<wz.p> aVar, String str, q<? super t, ? super a, ? super Integer, wz.p> qVar, p<? super a, ? super Integer, wz.p> pVar, p<? super a, ? super Integer, wz.p> pVar2, p<? super a, ? super Integer, wz.p> pVar3, long j11, ModalBottomSheetState modalBottomSheetState, CoroutineScope coroutineScope, g00.a<wz.p> aVar2, int i11, int i12, int i13) {
        super(2);
        this.f42272a = cVar;
        this.f42273b = num;
        this.f42274c = aVar;
        this.f42275d = str;
        this.f42276e = qVar;
        this.f42277f = pVar;
        this.f42278g = pVar2;
        this.f42279h = pVar3;
        this.f42280i = j11;
        this.f42281j = modalBottomSheetState;
        this.f42282x = coroutineScope;
        this.f42283y = aVar2;
        this.f42284z = i11;
        this.A = i12;
        this.B = i13;
    }

    public final void b(a aVar, int i11) {
        BottomSheetsKt.b(this.f42272a, this.f42273b, this.f42274c, this.f42275d, this.f42276e, this.f42277f, this.f42278g, this.f42279h, this.f42280i, this.f42281j, this.f42282x, this.f42283y, aVar, v0.a(this.f42284z | 1), v0.a(this.A), this.B);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
