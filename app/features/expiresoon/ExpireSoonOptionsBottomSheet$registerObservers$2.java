package com.forsale.app.features.expiresoon;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonOptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class ExpireSoonOptionsBottomSheet$registerObservers$2 implements FlowCollector<ListingDetailsEntity> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExpireSoonOptionsBottomSheet f31247a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExpireSoonOptionsBottomSheet$registerObservers$2(ExpireSoonOptionsBottomSheet expireSoonOptionsBottomSheet) {
        this.f31247a = expireSoonOptionsBottomSheet;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r10, zz.a<? super wz.p> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1 r0 = (com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1) r0
            int r1 = r0.f31253f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31253f = r1
            goto L18
        L13:
            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1 r0 = new com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2$emit$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f31251d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f31253f
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r10 = r0.f31250c
            androidx.activity.result.b r10 = (androidx.activity.result.b) r10
            java.lang.Object r1 = r0.f31249b
            com.forsale.app.datalayer.network.entities.ListingDetailsEntity r1 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r1
            java.lang.Object r0 = r0.f31248a
            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet r0 = (com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet) r0
            kotlin.f.b(r11)
            r3 = r1
            goto L67
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.f.b(r11)
            if (r10 == 0) goto L84
            com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet r11 = r9.f31247a
            androidx.activity.result.b r2 = com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet.D(r11)
            cx.a r4 = r11.G()
            java.lang.Object r4 = r4.get()
            ag.a r4 = (ag.a) r4
            r0.f31248a = r11
            r0.f31249b = r10
            r0.f31250c = r2
            r0.f31253f = r3
            java.lang.Object r0 = r4.a(r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            r3 = r10
            r10 = r2
            r8 = r0
            r0 = r11
            r11 = r8
        L67:
            zf.b r11 = (zf.b) r11
            android.content.Context r6 = r0.requireContext()
            java.lang.String r0 = "requireContext(...)"
            kotlin.jvm.internal.o.h(r6, r0)
            com.forsale.app.datalayer.network.entities.PostListingIntention r2 = com.forsale.app.datalayer.network.entities.PostListingIntention.BOOST_LISTING_ABOUT_TO_EXPIRE
            zf.a$a r7 = new zf.a$a
            r1 = 0
            r4 = 1
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Intent r11 = r11.b(r6, r7)
            r10.a(r11)
        L84:
            wz.p r10 = wz.p.f75480a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.expiresoon.ExpireSoonOptionsBottomSheet$registerObservers$2.emit(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }
}
