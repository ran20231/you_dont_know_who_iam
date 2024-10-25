package com.forsale.app.features.categories.home.propertyhome;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$setUp$2", f = "PropertyHomeViewModel.kt", l = {114, 115, 116, 117, 118, 119, 120, 121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PropertyHomeViewModel$setUp$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24849a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24850b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$setUp$2(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$setUp$2> aVar) {
        super(2, aVar);
        this.f24850b = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$setUp$2(this.f24850b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f24849a
            switch(r1) {
                case 0: goto L33;
                case 1: goto L2f;
                case 2: goto L2b;
                case 3: goto L27;
                case 4: goto L23;
                case 5: goto L1f;
                case 6: goto L1b;
                case 7: goto L16;
                case 8: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L11:
            kotlin.f.b(r11)
            goto Lb3
        L16:
            kotlin.f.b(r11)
            goto L90
        L1b:
            kotlin.f.b(r11)
            goto L84
        L1f:
            kotlin.f.b(r11)
            goto L78
        L23:
            kotlin.f.b(r11)
            goto L6c
        L27:
            kotlin.f.b(r11)
            goto L60
        L2b:
            kotlin.f.b(r11)
            goto L54
        L2f:
            kotlin.f.b(r11)
            goto L48
        L33:
            kotlin.f.b(r11)
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.C()
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$d r1 = com.forsale.app.features.categories.home.propertyhome.models.SectionState.d.f25086a
            r2 = 1
            r10.f24849a = r2
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto L48
            return r0
        L48:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 2
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.m(r11, r10)
            if (r11 != r0) goto L54
            return r0
        L54:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 3
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.q(r11, r10)
            if (r11 != r0) goto L60
            return r0
        L60:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 4
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.k(r11, r10)
            if (r11 != r0) goto L6c
            return r0
        L6c:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 5
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.o(r11, r10)
            if (r11 != r0) goto L78
            return r0
        L78:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 6
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.l(r11, r10)
            if (r11 != r0) goto L84
            return r0
        L84:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            r1 = 7
            r10.f24849a = r1
            java.lang.Object r11 = com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel.p(r11, r10)
            if (r11 != r0) goto L90
            return r0
        L90:
            com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel r11 = r10.f24850b
            kotlinx.coroutines.flow.MutableStateFlow r11 = r11.C()
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$f r1 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState$f
            com.forsale.app.features.categories.home.propertyhome.models.SectionState$e r9 = new com.forsale.app.features.categories.home.propertyhome.models.SectionState$e
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 15
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.<init>(r9)
            r2 = 8
            r10.f24849a = r2
            java.lang.Object r11 = r11.emit(r1, r10)
            if (r11 != r0) goto Lb3
            return r0
        Lb3:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$setUp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$setUp$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
