package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import com.forsale.app.datalayer.repositories.FollowRepository;
import jj.b;
import kotlin.jvm.internal.o;
/* compiled from: FollowInteractor.kt */
/* loaded from: classes2.dex */
public final class FollowInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final FollowRepository f25936a;

    /* renamed from: b  reason: collision with root package name */
    private final b f25937b;

    public FollowInteractor(FollowRepository followRepository, b prefs) {
        o.i(followRepository, "followRepository");
        o.i(prefs, "prefs");
        this.f25936a = followRepository;
        this.f25937b = prefs;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081 A[PHI: r11 
      PHI: (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v1 java.lang.Object) binds: [B:26:0x007e, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[PHI: r11 
      PHI: (r11v15 java.lang.Object) = (r11v14 java.lang.Object), (r11v1 java.lang.Object) binds: [B:33:0x00a3, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r9, java.lang.String r10, zz.a<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor$followUser$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor$followUser$1 r0 = (com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor$followUser$1) r0
            int r1 = r0.f25942e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25942e = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor$followUser$1 r0 = new com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor$followUser$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f25940c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25942e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L58
            if (r2 == r6) goto L4c
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.f.b(r11)
            goto La6
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f25939b
            com.forsale.app.datalayer.repositories.FollowRepository r9 = (com.forsale.app.datalayer.repositories.FollowRepository) r9
            java.lang.Object r10 = r0.f25938a
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r11)
            goto L97
        L48:
            kotlin.f.b(r11)
            goto L81
        L4c:
            java.lang.Object r9 = r0.f25939b
            com.forsale.app.datalayer.repositories.FollowRepository r9 = (com.forsale.app.datalayer.repositories.FollowRepository) r9
            java.lang.Object r10 = r0.f25938a
            java.lang.String r10 = (java.lang.String) r10
            kotlin.f.b(r11)
            goto L72
        L58:
            kotlin.f.b(r11)
            if (r9 == 0) goto L82
            com.forsale.app.datalayer.repositories.FollowRepository r9 = r8.f25936a
            jj.b r11 = r8.f25937b
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r11 = r11.l()
            r0.f25938a = r10
            r0.f25939b = r9
            r0.f25942e = r6
            java.lang.Object r11 = r11.d(r0)
            if (r11 != r1) goto L72
            return r1
        L72:
            java.lang.String r11 = (java.lang.String) r11
            r0.f25938a = r7
            r0.f25939b = r7
            r0.f25942e = r5
            java.lang.Object r11 = r9.follow(r11, r10, r0)
            if (r11 != r1) goto L81
            return r1
        L81:
            return r11
        L82:
            com.forsale.app.datalayer.repositories.FollowRepository r9 = r8.f25936a
            jj.b r11 = r8.f25937b
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r11 = r11.l()
            r0.f25938a = r10
            r0.f25939b = r9
            r0.f25942e = r4
            java.lang.Object r11 = r11.d(r0)
            if (r11 != r1) goto L97
            return r1
        L97:
            java.lang.String r11 = (java.lang.String) r11
            r0.f25938a = r7
            r0.f25939b = r7
            r0.f25942e = r3
            java.lang.Object r11 = r9.unfollow(r11, r10, r0)
            if (r11 != r1) goto La6
            return r1
        La6:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FollowInteractor.a(boolean, java.lang.String, zz.a):java.lang.Object");
    }
}
