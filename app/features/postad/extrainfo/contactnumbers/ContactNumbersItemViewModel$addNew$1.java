package com.forsale.app.features.postad.extrainfo.contactnumbers;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContactNumbersItemViewModel.kt */
@d(c = "com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel$addNew$1", f = "ContactNumbersItemViewModel.kt", l = {113, 116}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ContactNumbersItemViewModel$addNew$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35593a;

    /* renamed from: b  reason: collision with root package name */
    int f35594b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35595c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ContactNumbersItemViewModel f35596d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f35597e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactNumbersItemViewModel$addNew$1(String str, ContactNumbersItemViewModel contactNumbersItemViewModel, boolean z11, a<? super ContactNumbersItemViewModel$addNew$1> aVar) {
        super(2, aVar);
        this.f35595c = str;
        this.f35596d = contactNumbersItemViewModel;
        this.f35597e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ContactNumbersItemViewModel$addNew$1(this.f35595c, this.f35596d, this.f35597e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f35594b
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L15
            kotlin.f.b(r9)
            goto Lae
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r1 = r8.f35593a
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            kotlin.f.b(r9)
            goto L7c
        L25:
            kotlin.f.b(r9)
            java.lang.String r9 = r8.f35595c
            int r9 = r9.length()
            if (r9 <= 0) goto L32
            r9 = r5
            goto L33
        L32:
            r9 = r3
        L33:
            if (r9 == 0) goto Lae
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r9 = r8.f35596d
            com.forsale.app.utils.v r9 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.x0(r9)
            java.lang.String r1 = r8.f35595c
            java.lang.String r9 = r9.c(r1)
            if (r9 == 0) goto L44
            goto L46
        L44:
            java.lang.String r9 = r8.f35595c
        L46:
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r1 = r8.f35596d
            java.util.Set r1 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.w0(r1)
            boolean r1 = r1.add(r9)
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.a.a(r1)
            boolean r6 = r1.booleanValue()
            if (r6 == 0) goto L5b
            goto L5c
        L5b:
            r1 = r2
        L5c:
            if (r1 == 0) goto L7c
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r6 = r8.f35596d
            boolean r7 = r8.f35597e
            r1.booleanValue()
            kotlinx.coroutines.flow.MutableSharedFlow r6 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.y0(r6)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.a.a(r7)
            kotlin.Pair r9 = wz.i.a(r9, r7)
            r8.f35593a = r1
            r8.f35594b = r5
            java.lang.Object r9 = r6.emit(r9, r8)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r9 = r8.f35596d
            java.util.Set r1 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.w0(r9)
            int r1 = r1.size()
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r6 = r8.f35596d
            int r6 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.v0(r6)
            if (r1 < r6) goto L8f
            r3 = r5
        L8f:
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.z0(r9, r3)
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r9 = r8.f35596d
            androidx.databinding.ObservableField r9 = r9.E0()
            java.lang.String r1 = ""
            r9.k(r1)
            com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel r9 = r8.f35596d
            java.util.Set r1 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.w0(r9)
            r8.f35593a = r2
            r8.f35594b = r4
            java.lang.Object r9 = com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel.A0(r9, r1, r8)
            if (r9 != r0) goto Lae
            return r0
        Lae:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extrainfo.contactnumbers.ContactNumbersItemViewModel$addNew$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ContactNumbersItemViewModel$addNew$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
