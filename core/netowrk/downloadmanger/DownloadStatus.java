package com.forsale.core.netowrk.downloadmanger;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DownloadStatus.kt */
/* loaded from: classes3.dex */
public abstract class DownloadStatus {

    /* compiled from: DownloadStatus.kt */
    /* loaded from: classes3.dex */
    public static final class Failed extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public static final Failed f40620a = new Failed();

        private Failed() {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return true;
        }

        public int hashCode() {
            return 775485433;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Failed";
        }
    }

    /* compiled from: DownloadStatus.kt */
    /* loaded from: classes3.dex */
    public static final class a extends DownloadStatus {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40621a = new a();

        private a() {
            super(null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return true;
        }

        public int hashCode() {
            return 1784632263;
        }

        public String toString() {
            return "Success";
        }
    }

    private DownloadStatus() {
    }

    public /* synthetic */ DownloadStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
