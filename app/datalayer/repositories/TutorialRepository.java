package com.forsale.app.datalayer.repositories;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: TutorialRepository.kt */
/* loaded from: classes2.dex */
public final class TutorialRepository {
    public static final String WALKTHROUGH_PAGE_FORSALE = "https://www.q84sale.com/walkthrough/index.html";
    public static final String WALKTHROUGH_PAGE_Q8CAR = "https://www.q84sale.com/q8car_walkthrough/index.html";
    private final ApplicationResourcesRepository resourcesRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: TutorialRepository.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TutorialRepository(ApplicationResourcesRepository resourcesRepository) {
        o.i(resourcesRepository, "resourcesRepository");
        this.resourcesRepository = resourcesRepository;
    }

    private final String getBaseUrl() {
        return WALKTHROUGH_PAGE_FORSALE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getWalkThroughUrl(zz.a<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.TutorialRepository$getWalkThroughUrl$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.TutorialRepository$getWalkThroughUrl$1 r0 = (com.forsale.app.datalayer.repositories.TutorialRepository$getWalkThroughUrl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.TutorialRepository$getWalkThroughUrl$1 r0 = new com.forsale.app.datalayer.repositories.TutorialRepository$getWalkThroughUrl$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.TutorialRepository r0 = (com.forsale.app.datalayer.repositories.TutorialRepository) r0
            kotlin.f.b(r5)
            goto L54
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.f.b(r5)
            com.forsale.app.utils.Languages r5 = com.forsale.app.utils.Languages.ARABIC
            java.lang.String r5 = r5.getValue()
            com.forsale.app.utils.LocaleManager r2 = com.forsale.app.utils.LocaleManager.f39597a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r0 = r2.h(r0)
            if (r0 != r1) goto L51
            return r1
        L51:
            r1 = r5
            r5 = r0
            r0 = r4
        L54:
            boolean r5 = kotlin.jvm.internal.o.d(r1, r5)
            if (r5 == 0) goto L7e
            java.lang.String r5 = r0.getBaseUrl()
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r0 = r0.resourcesRepository
            int r1 = t9.y0.f70387ba
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = "?="
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            goto L82
        L7e:
            java.lang.String r5 = r0.getBaseUrl()
        L82:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.TutorialRepository.getWalkThroughUrl(zz.a):java.lang.Object");
    }
}
