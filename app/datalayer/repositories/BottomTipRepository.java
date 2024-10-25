package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.BottomTipEntity;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
import wz.p;
/* compiled from: BottomTipRepository.kt */
/* loaded from: classes2.dex */
public final class BottomTipRepository {
    public static final int $stable = 8;
    private final BottomTipDao bottomTipDao;
    private final h isBottomToolTipPulledInSession$delegate;

    public BottomTipRepository(BottomTipDao bottomTipDao) {
        h a11;
        o.i(bottomTipDao, "bottomTipDao");
        this.bottomTipDao = bottomTipDao;
        a11 = d.a(new g00.a<AtomicBoolean>() { // from class: com.forsale.app.datalayer.repositories.BottomTipRepository$isBottomToolTipPulledInSession$2
            @Override // g00.a
            public final AtomicBoolean invoke() {
                return new AtomicBoolean(false);
            }
        });
        this.isBottomToolTipPulledInSession$delegate = a11;
    }

    private final BottomTipEntity findNext(List<BottomTipEntity> list, int i11) {
        BottomTipEntity bottomTipEntity;
        do {
            if (i11 == list.size() - 1) {
                i11 = 0;
            } else {
                i11++;
            }
            if (list.get(i11).isLastShow() && list.get(i11).getCountViews() >= list.get(i11).getMaxViewsSessions()) {
                return null;
            }
            bottomTipEntity = list.get(i11);
        } while (bottomTipEntity.getCountViews() >= bottomTipEntity.getMaxViewsSessions());
        return bottomTipEntity;
    }

    private final BottomTipEntity getNext(List<BottomTipEntity> list) {
        Object m02;
        Iterator<BottomTipEntity> it2 = list.iterator();
        int i11 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().isLastShow()) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1) {
            m02 = CollectionsKt___CollectionsKt.m0(list);
            return (BottomTipEntity) m02;
        }
        return findNext(list, i11);
    }

    private final AtomicBoolean isBottomToolTipPulledInSession() {
        return (AtomicBoolean) this.isBottomToolTipPulledInSession$delegate.getValue();
    }

    public final void clearIsBottomToolTipPulledInSession() {
        isBottomToolTipPulledInSession().lazySet(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object postBottomToolTipPull(int r6, zz.a<? super wz.p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.datalayer.repositories.BottomTipRepository$postBottomToolTipPull$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.datalayer.repositories.BottomTipRepository$postBottomToolTipPull$1 r0 = (com.forsale.app.datalayer.repositories.BottomTipRepository$postBottomToolTipPull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.BottomTipRepository$postBottomToolTipPull$1 r0 = new com.forsale.app.datalayer.repositories.BottomTipRepository$postBottomToolTipPull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.f.b(r7)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r6 = r0.I$0
            java.lang.Object r2 = r0.L$0
            com.forsale.app.datalayer.repositories.BottomTipRepository r2 = (com.forsale.app.datalayer.repositories.BottomTipRepository) r2
            kotlin.f.b(r7)
            goto L4f
        L3e:
            kotlin.f.b(r7)
            r0.L$0 = r5
            r0.I$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.resetLastShow(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            r7 = 0
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r6 = r2.updateSingleTip(r6, r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.BottomTipRepository.postBottomToolTipPull(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object pullBottomToolTip(zz.a<? super com.forsale.app.datalayer.database.BottomTipEntity> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.datalayer.repositories.BottomTipRepository$pullBottomToolTip$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.datalayer.repositories.BottomTipRepository$pullBottomToolTip$1 r0 = (com.forsale.app.datalayer.repositories.BottomTipRepository$pullBottomToolTip$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.BottomTipRepository$pullBottomToolTip$1 r0 = new com.forsale.app.datalayer.repositories.BottomTipRepository$pullBottomToolTip$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.L$1
            com.forsale.app.datalayer.repositories.BottomTipRepository r1 = (com.forsale.app.datalayer.repositories.BottomTipRepository) r1
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.BottomTipRepository r0 = (com.forsale.app.datalayer.repositories.BottomTipRepository) r0
            kotlin.f.b(r5)
            goto L59
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            kotlin.f.b(r5)
            java.util.concurrent.atomic.AtomicBoolean r5 = r4.isBottomToolTipPulledInSession()
            boolean r5 = r5.get()
            if (r5 == 0) goto L48
            r5 = 0
            return r5
        L48:
            com.forsale.app.datalayer.repositories.BottomTipDao r5 = r4.bottomTipDao
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r5 = r5.getAllBottomTips(r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            r0 = r4
            r1 = r0
        L59:
            java.util.List r5 = (java.util.List) r5
            com.forsale.app.datalayer.database.BottomTipEntity r5 = r1.getNext(r5)
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.isBottomToolTipPulledInSession()
            r0.lazySet(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.BottomTipRepository.pullBottomToolTip(zz.a):java.lang.Object");
    }

    public final Object resetLastShow(zz.a<? super p> aVar) {
        Object f11;
        Object resetLastShow = this.bottomTipDao.resetLastShow(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (resetLastShow == f11) {
            return resetLastShow;
        }
        return p.f75480a;
    }

    public final Object updateSingleTip(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object updateSingleTip = this.bottomTipDao.updateSingleTip(i11, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (updateSingleTip == f11) {
            return updateSingleTip;
        }
        return p.f75480a;
    }
}
