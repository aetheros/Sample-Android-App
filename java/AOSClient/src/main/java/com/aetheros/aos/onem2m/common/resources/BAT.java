// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.aos.onem2m.common.resources;

public class BAT extends Child {
    private InnerClass bat;

    public BAT() {}

    public String getBtl() {
        return bat.btl;
    }

    public String getBts() {
        return bat.bts;
    }

    public String getCt() {
        return bat.ct;
    }

    public String getLt() {
        return bat.lt;
    }

    public String getMgd() {
        return bat.mgd;
    }

    public String getPi() {
        return bat.pi;
    }

    public String getRi() {
        return bat.ri;
    }

    public String getRn() {
        return bat.rn;
    }

    public String getTy() {
        return bat.ty;
    }



    class InnerClass {
        private String btl;
        private String bts;
        private String ct;
        private String lt;
        private String mgd;
        private String pi;
        private String ri;
        private String rn;
        private String ty;

        public String getBtl() {
            return this.btl;
        }

        public void setBtl(String btl) {
            this.btl = btl;
        }

        public String getBts() {
            return this.bts;
        }

        public void setBts(String bts) {
            this.bts = bts;
        }

        public String getCt() {
            return this.ct;
        }

        public void setCt(String ct) {
            this.ct = ct;
        }

        public String getLt() {
            return this.lt;
        }

        public void setLt(String lt) {
            this.lt = lt;
        }

        public String getMgd() {
            return this.mgd;
        }

        public void setMgd(String mgd) {
            this.mgd = mgd;
        }

        public String getPi() {
            return this.pi;
        }

        public void setPi(String pi) {
            this.pi = pi;
        }

        public String getRi() {
            return this.ri;
        }

        public void setRi(String ri) {
            this.ri = ri;
        }

        public String getRn() {
            return this.rn;
        }

        public void setRn(String rn) {
            this.rn = rn;
        }

        public String getTy() {
            return this.ty;
        }

        public void setTy(String ty) {
            this.ty = ty;
        }
    }
}