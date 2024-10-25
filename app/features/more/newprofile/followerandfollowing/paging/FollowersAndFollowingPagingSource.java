package com.forsale.app.features.more.newprofile.followerandfollowing.paging;

import androidx.paging.PagingSource;
import androidx.paging.m;
import com.forsale.app.datalayer.network.responses.FollowResponse;
import kotlin.jvm.internal.o;
import vd.a;
/* compiled from: FollowersAndFollowingPagingSource.kt */
/* loaded from: classes2.dex */
public final class FollowersAndFollowingPagingSource extends PagingSource<Integer, FollowResponse.User> {

    /* renamed from: b  reason: collision with root package name */
    private final String f32300b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f32301c;

    /* renamed from: d  reason: collision with root package name */
    private final int f32302d;

    /* renamed from: e  reason: collision with root package name */
    private final a f32303e;

    public FollowersAndFollowingPagingSource(String phone, boolean z11, int i11, a followersDataSource) {
        o.i(phone, "phone");
        o.i(followersDataSource, "followersDataSource");
        this.f32300b = phone;
        this.f32301c = z11;
        this.f32302d = i11;
        this.f32303e = followersDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:12:0x0028, B:24:0x0059, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:27:0x0066, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:36:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: Exception -> 0x007b, TryCatch #0 {Exception -> 0x007b, blocks: (B:12:0x0028, B:24:0x0059, B:28:0x006c, B:30:0x0072, B:31:0x0077, B:27:0x0066, B:17:0x0037, B:19:0x003f, B:21:0x0045), top: B:36:0x0022 }] */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(androidx.paging.PagingSource.a<java.lang.Integer> r9, zz.a<? super androidx.paging.PagingSource.b<java.lang.Integer, com.forsale.app.datalayer.network.responses.FollowResponse.User>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource$load$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource$load$1 r0 = (com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource$load$1) r0
            int r1 = r0.f32307d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32307d = r1
            goto L18
        L13:
            com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource$load$1 r0 = new com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource$load$1
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.f32305b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f32307d
            r7 = 1
            if (r1 == 0) goto L34
            if (r1 != r7) goto L2c
            int r9 = r6.f32304a
            kotlin.f.b(r10)     // Catch: java.lang.Exception -> L7b
            goto L59
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            kotlin.f.b(r10)
            java.lang.Object r9 = r9.a()     // Catch: java.lang.Exception -> L7b
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch: java.lang.Exception -> L7b
            if (r9 == 0) goto L44
            int r9 = r9.intValue()     // Catch: java.lang.Exception -> L7b
            goto L45
        L44:
            r9 = r7
        L45:
            vd.a r1 = r8.f32303e     // Catch: java.lang.Exception -> L7b
            boolean r3 = r8.f32301c     // Catch: java.lang.Exception -> L7b
            java.lang.String r4 = r8.f32300b     // Catch: java.lang.Exception -> L7b
            int r5 = r8.f32302d     // Catch: java.lang.Exception -> L7b
            r6.f32304a = r9     // Catch: java.lang.Exception -> L7b
            r6.f32307d = r7     // Catch: java.lang.Exception -> L7b
            r2 = r9
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L7b
            if (r10 != r0) goto L59
            return r0
        L59:
            com.forsale.app.datalayer.network.responses.FollowResponse r10 = (com.forsale.app.datalayer.network.responses.FollowResponse) r10     // Catch: java.lang.Exception -> L7b
            androidx.paging.PagingSource$b$b r0 = new androidx.paging.PagingSource$b$b     // Catch: java.lang.Exception -> L7b
            java.util.List r1 = r10.getUsers()     // Catch: java.lang.Exception -> L7b
            r2 = 0
            if (r9 != r7) goto L66
            r3 = r2
            goto L6c
        L66:
            int r3 = r9 + (-1)
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.a.d(r3)     // Catch: java.lang.Exception -> L7b
        L6c:
            int r10 = r10.getTotalPages()     // Catch: java.lang.Exception -> L7b
            if (r10 <= r9) goto L77
            int r9 = r9 + r7
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.a.d(r9)     // Catch: java.lang.Exception -> L7b
        L77:
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Exception -> L7b
            return r0
        L7b:
            r9 = move-exception
            androidx.paging.PagingSource$b$a r10 = new androidx.paging.PagingSource$b$a
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.newprofile.followerandfollowing.paging.FollowersAndFollowingPagingSource.f(androidx.paging.PagingSource$a, zz.a):java.lang.Object");
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: i */
    public Integer d(m<Integer, FollowResponse.User> state) {
        Integer e11;
        Integer valueOf;
        Integer j11;
        o.i(state, "state");
        Integer d11 = state.d();
        if (d11 == null) {
            return null;
        }
        int intValue = d11.intValue();
        PagingSource.b.C0141b<Integer, FollowResponse.User> c11 = state.c(intValue);
        if (c11 != null && (j11 = c11.j()) != null) {
            valueOf = Integer.valueOf(j11.intValue() + 1);
        } else {
            PagingSource.b.C0141b<Integer, FollowResponse.User> c12 = state.c(intValue);
            if (c12 == null || (e11 = c12.e()) == null) {
                return null;
            }
            valueOf = Integer.valueOf(e11.intValue() - 1);
        }
        return valueOf;
    }
}
